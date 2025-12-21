package zxylearn.bcnlserver.utils;

import java.security.Key;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;


@Component
public class JwtUtil {
    @Value("${jwt.secret}")
    private String secret;

    @Value("${jwt.access-token-expiration}")
    private long accessTokenExpiration;

    @Value("${jwt.refresh-token-expiration}")
    private long refreshTokenExpiration;

    // 生成访问令牌
    public String generateAccessToken(String userId) {
        Map<String, Object> claims = Map.of("type", "access");
        return createToken(claims, userId, accessTokenExpiration);
    }

    // 生成刷新令牌
    public String generateRefreshToken(String userId) {
        Map<String, Object> claims = Map.of("type", "refresh");
        return createToken(claims, userId, refreshTokenExpiration);
    }

    // 验证访问令牌
    public String verifyAccessToken(String token) {
        try {
            var claims = io.jsonwebtoken.Jwts.parserBuilder()
                    .setSigningKey(getSigningKey())
                    .build()
                    .parseClaimsJws(token)
                    .getBody();
            if ("access".equals(claims.get("type"))) {
                return claims.getSubject();
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }

    // 验证刷新令牌
    public String verifyRefreshToken(String token) {
        try {
            var claims = io.jsonwebtoken.Jwts.parserBuilder()
                    .setSigningKey(getSigningKey())
                    .build()
                    .parseClaimsJws(token)
                    .getBody();
            if ("refresh".equals(claims.get("type"))) {
                return claims.getSubject();
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }

    // 获取令牌ID
    public String getTokenId(String token) {
        try {
            var claims = io.jsonwebtoken.Jwts.parserBuilder()
                    .setSigningKey(getSigningKey())
                    .build()
                    .parseClaimsJws(token)
                    .getBody();
            return claims.getId();
        } catch (Exception e) {
            return null;
        }
    }

    // 获取令牌过期时间
    public Date getTokenExpiration(String token) {
        try {
            var claims = io.jsonwebtoken.Jwts.parserBuilder()
                    .setSigningKey(getSigningKey())
                    .build()
                    .parseClaimsJws(token)
                    .getBody();
            return claims.getExpiration();
        } catch (Exception e) {
            return null;
        }
    }

    // 创建JWT令牌
    private String createToken(Map<String, Object> claims, String subject, long expiration) {
        Date now = new Date();
        Date expiryDate = new Date(now.getTime() + expiration);
        return io.jsonwebtoken.Jwts.builder()
                .setClaims(claims)
                .setSubject(subject)
                .setId(UUID.randomUUID().toString())
                .setIssuedAt(now)
                .setExpiration(expiryDate)
                .signWith(getSigningKey(), SignatureAlgorithm.HS512)
                .compact();
    }

    private Key getSigningKey() {
        byte[] keyBytes = Decoders.BASE64.decode(secret);
        return Keys.hmacShaKeyFor(keyBytes);
    }
}

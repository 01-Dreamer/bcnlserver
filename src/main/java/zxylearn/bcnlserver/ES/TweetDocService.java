package zxylearn.bcnlserver.ES;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Service;


@Service
public class TweetDocService {

    @Autowired
    private ElasticsearchOperations esOps;


}

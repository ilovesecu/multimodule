package sj.example.batch;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import sj.example.BatchVO;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Component
@Slf4j
public class BatchService {
    @Scheduled(fixedDelay = 5000)
    public void testSchdule(){
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowPlus = now.plusSeconds(5L);

        String parsedLocalDateTimeNow = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String parsedLocalDateTimeNow2 = nowPlus.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        BatchVO vo = new BatchVO();
        vo.setBatchId("TEST BATCH ID");
        vo.setStDate(parsedLocalDateTimeNow);
        vo.setEdDate(parsedLocalDateTimeNow2);

        log.error("뜰 수도 있을거 같아서 말씀드리는거거든요:{}",vo);
    }
}

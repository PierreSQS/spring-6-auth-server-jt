package guru.springframework.spring6authserver;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class Spring6AuthServerApplicationTests {

    @Test
    void contextLoads(ApplicationContext appCtx) {
        assertThat(appCtx).isNotNull();
    }

}

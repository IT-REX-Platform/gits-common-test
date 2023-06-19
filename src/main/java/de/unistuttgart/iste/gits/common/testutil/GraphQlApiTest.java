package de.unistuttgart.iste.gits.common.testutil;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.lang.annotation.*;

/**
 * This annotation is a combination of {@link SpringBootTest} and the two test extensions
 * {@link GraphQlTesterParameterResolver} and {@link ClearDatabase}.
 */
@ExtendWith(GraphQlTesterParameterResolver.class)
@ExtendWith(ClearDatabase.class)
@SpringBootTest
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@ActiveProfiles("test")
@Testcontainers
public @interface GraphQlApiTest {
}

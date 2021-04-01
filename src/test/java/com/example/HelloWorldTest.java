package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@SuppressWarnings("ResultOfMethodCallIgnored")
@ExtendWith(MockitoExtension.class)
public class HelloWorldTest {
    @Mock
    private WebServiceApi api;

    @InjectMocks
    @Spy
    private HelloWorld hello;

    @Test
    public void mockStatic() {
        try (MockedStatic<HelloWorld> mocked = Mockito.mockStatic(HelloWorld.class)) {
            mocked.when(HelloWorld::method2).thenReturn("Bye!");
            assertEquals("Bye!!", hello.method3());
        }
    }
    
    @Test
    public void mockApi() {
        when(api.getDataFrom(eq("test"))).thenReturn(Map.of("data", "result"));

        String result = hello.method4("test");

        assertEquals("result", result);
    }

    @Test
    public void mockFinal() {
        when(hello.method5()).thenReturn("Bye");

        String result = hello.method6();

        assertEquals("Bye!", result);
    }
}

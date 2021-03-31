package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@SuppressWarnings("ResultOfMethodCallIgnored")
@ExtendWith(MockitoExtension.class)
public class HelloWorldTest {
    @Spy
    private HelloWorld hello;
    
    @Test
    public void test() {
        try (MockedStatic<HelloWorld> mocked = Mockito.mockStatic(HelloWorld.class)) {
            mocked.when(HelloWorld::method2).thenReturn("Bye!");
            assertEquals("Bye!!", hello.method3());
        }
    }
}

package com.example.effetivejavachapter6.item39;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class RunTests {

    public static void execute(String className) throws ClassNotFoundException {
        int tests = 0;
        int passed = 0;
        Class<?> testClass = Class.forName(className);

        Method[] declaredMethods = testClass.getDeclaredMethods();

        List<Method> filteredMethods = Arrays.stream(declaredMethods)
                .filter(method -> method.isAnnotationPresent(test.class))
                .toList();

        for (Method declaredMethod : filteredMethods) {
                try {
                    tests ++;
                    declaredMethod.invoke(null);
                } catch (InvocationTargetException e) {

                    Throwable targetException = e.getTargetException();
                    Class<? extends Throwable> expectedType = declaredMethod
                            .getAnnotation(test.class)
                            .value();

                    if (expectedType.isInstance(targetException)) {
                        passed++;
                    } else {
                        System.out.printf("테스트 %s 실패: 기대한 예외 %s, 발생한 예외 %s%n",
                                declaredMethod, expectedType, targetException);
                    }
                } catch (Exception e) {
                    System.out.println("잘못 사용한 @test:" + declaredMethod);
                }
            }
        System.out.printf("성공: %d, 실패: %d", passed, tests - passed);
    }
}

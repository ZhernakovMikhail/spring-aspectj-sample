package com.zhernakov.samples.spring.aspectj.model;

import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by Misha on 20.07.2015.
 */
public class Giovanni implements Performer {

    private int counter;

    @Override
    public void perform() throws PerformException {
        System.out.print(String.format("Песня №%d: ", counter += 1));
        if (RandomUtils.nextInt(0, 50) != 27) {
            System.out.println(StringUtils.repeat("ЛА", ", ", RandomUtils.nextInt(8, 15)));
        } else {
            String message = StringUtils.repeat("Хрп, хрр-р, Кхе-кхе", ", ", RandomUtils.nextInt(2, 5));
            System.err.println(message);
            throw new PerformException(message);
        }
    }
}

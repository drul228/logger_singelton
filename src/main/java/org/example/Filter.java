package org.example;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем фильтрацию");
        List<Integer> result = source;
        for (Integer x :
                result) {
            int filterSuccses = 0;
            if (x < this.treshold) {
                logger.log("Элемент " + x + " не подходит");
            }
            logger.log("Элемент " + x + " подходит");
            filterSuccses++;
            logger.log("Прошло фильтр " + filterSuccses + " из " + result.stream().count());
        }
        result.stream().filter(x -> x > treshold).toArray();
        return result;
    }
}

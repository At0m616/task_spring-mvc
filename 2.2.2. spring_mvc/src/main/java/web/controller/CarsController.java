package web.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import web.config.WebConfig;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

//1. Создайте еще один контроллер, замаппленный на /cars.
//2. Создайте модель Car с тремя произвольными полями.
//3. Создайте список из 5 машин.
//4. Создайте сервис с методом, который будет возвращать указанное число машин из созданного списка.
//5. Создайте страницу cars.html. Реализуйте создание таблицы с машинами из сервиса с помощью thymeleaf.
//6. При запросе /cars выводить весь список. При запросе /cars?count=2 должен отобразиться список из 2 машин,
//при /cars?count=3 - из 3, и тд. При count ≥ 5 выводить весь список машин.
@Controller
public class CarsController {
        private List<Car> carList = new ArrayList<>();
    {
        carList.add(new Car("Ferrary", 1352,5034350));
        carList.add(new Car("Ford", 2042,34350));
        carList.add(new Car("Mazda", 1014,45350));
    }
    @GetMapping(value = "/cars")
    public String getListCar(@RequestParam(value = "count",required = false)Integer count, ModelMap model){

            model.addAttribute("carList" + carList);

        return "carPage";
    }

}

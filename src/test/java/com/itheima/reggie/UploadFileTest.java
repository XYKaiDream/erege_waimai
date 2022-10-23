package com.itheima.reggie;

import com.itheima.reggie.entity.Employee;
import com.itheima.reggie.service.EmployeeService;
import com.itheima.reggie.service.impl.EmployeeServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;
import java.util.Set;

@SpringBootTest
//@RunWith(SpringRunner.class)
public class UploadFileTest {
    @Resource
    private RedisTemplate redisTemplate;
    @Test
    public void test1(){
        String fileName = "ererewe.jpg";
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        System.out.println(suffix);
    }

    @Test
    public void test(){
//        Jedis jedis = new Jedis("101.89.183.56",6379);
//        jedis.auth("123456");
//        jedis.set("name","demojedis");
//        jedis.close()
        redisTemplate.opsForValue().set("Jedisidea","demodemo");
//        redisTemplate.delete("Jedisidea");
    }
    @Test
    public void Test2(){
        redisTemplate.opsForHash().put("2","name","xiaoxiao");
        redisTemplate.opsForHash().put("2","age","xiaoxiao2");
        redisTemplate.opsForHash().put("2","id","xiaoxiao3");
        Set key = redisTemplate.opsForHash().keys("2");
        for (Object o : key) {
            System.out.println(o);
        }
    }
//    @Autowired
//    private EmployeeService employeeService;
    @Test
    public void Test3(){
        Employee employee = new Employee();
        EmployeeService employeeService = new EmployeeServiceImpl();
        employee = employeeService.getById(1);
        System.out.println(employee.getName());
    }
}

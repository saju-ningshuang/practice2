package com.itheima.test;
import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {
    @Test
    public void findById() {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
//        ItemsDao itemsDao = applicationContext.getBean(ItemsDao.class);
//        Items item = itemsDao.findById(1);
//        System.out.println(item.getName());

    }
}

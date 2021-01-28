package com.hr.service;

import com.hr.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
@Component
public class FallBackUtil implements FallbackFactory<DeptService> {
    public FallBackUtil(){
        System.out.println("create FallBackUtil");
    }
    public DeptService create(Throwable throwable) {
        return new DeptService() {
            public List show() {
                return null;
            }

            public void add(Dept data) {

            }

            public void del(int id) {

            }

            public void update(Dept data) {

            }

            public List seach(String name) {
                return null;
            }

            public Dept load(int id) {
                return null;
            }

            public void delAll(int[] ides) {

            }

            public List pager(Map map) {
                return null;
            }

            public Dept test() {
                System.out.println("请稍候。。。。。。。");
                return null;
            }
        };
    }
}

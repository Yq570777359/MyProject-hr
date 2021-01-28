package com.hr.controller;


import com.hr.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/emp")
public class EmpController_consumer {
    private final static String REST_URI_PRIFIX = "http://localhost:9999";
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/count")
    public List count(){
        List list = restTemplate.getForObject(REST_URI_PRIFIX+"/emp/count",List.class);
        return list;
    }

    @RequestMapping("/pager")
    public List pager(int pageNo,int pageSize){
        Map map = new HashMap();
        map.put("pageSize",pageSize);
        map.put("start",(pageNo-1)*pageSize);
        List list = restTemplate.postForObject(REST_URI_PRIFIX+"emp/pager",map,List.class);
        return list;
    }
    @RequestMapping("/{id}/del")
    public void del(@PathVariable int id){
        restTemplate.delete(REST_URI_PRIFIX+"/emp/"+id+"/del");
    }
    @RequestMapping("/loadDept")
    public List loadDept(){
        List allDept = restTemplate.getForObject(REST_URI_PRIFIX+"emp/loadDept",List.class);
        return allDept;
    }
    @RequestMapping("/loadRole")
    public List loadRole() {
        List allRole = restTemplate.getForObject(REST_URI_PRIFIX+"emp/loadRole",List.class);
        return allRole;
    }
    @RequestMapping(value="/add",method = RequestMethod.POST)
    public void add(MultipartFile photoFile, Emp data, HttpServletRequest request){
        System.out.println(data);
        System.out.println(photoFile.getOriginalFilename());
        File file = new File(photoFile.getOriginalFilename(),photoFile.getOriginalFilename());
        System.out.println(file.getName());
        try{
           /* String photoName = photoFile.getOriginalFilename();
            String path = request.getSession().getServletContext().getRealPath("/images");
            File uploadFile = new File(path,photoName);
            photoFile.transferTo(uploadFile);
            data.setPwd("123123");
            data.setPhoto(photoName);*/
            restTemplate.postForObject(REST_URI_PRIFIX+"/emp/add",data,Emp.class);
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    @RequestMapping("/update")
    public void update(@RequestBody Emp data){
        restTemplate.postForObject(REST_URI_PRIFIX+"/emp/update",data,Emp.class);
    }

}

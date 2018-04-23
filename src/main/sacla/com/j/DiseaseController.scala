package com.j

import java.util

import com.j.po.DictDisease
import com.j.service.DictDiseaseService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.ComponentScan
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, ResponseBody}

/**
  * Created by jufeng on 2018/4/23.
  */

@ComponentScan
@Controller
@ResponseBody
class DiseaseController  @Autowired()(private val dictDiseaseService : DictDiseaseService){

  @RequestMapping(value = Array("/index"),method = Array(RequestMethod.GET))
  def index(): util.List[DictDisease]={
    dictDiseaseService.findList
  }

}

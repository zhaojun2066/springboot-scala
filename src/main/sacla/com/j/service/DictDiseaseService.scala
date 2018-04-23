package com.j.service

import com.j.dao.DictDiseaseDao
import com.j.po.DictDisease
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

/**
  * Created by jufeng on 2018/4/23.
  */

@Service
class DictDiseaseService extends BaseService[DictDisease]{
  @Autowired val dictDiseaseDao: DictDiseaseDao  =  null
  @Transactional
  def findList = {
    findAll
  }
}

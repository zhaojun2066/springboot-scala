package com.j.dao

import com.j.po.DictDisease
import org.springframework.data.jpa.repository.JpaRepository
import java.lang.Long
/**
  * Created by jufeng on 2018/4/23.
  */

import scala.language.implicitConversions
trait DictDiseaseDao extends JpaRepository[DictDisease,Long]

package com.j.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.{Page, PageRequest}
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.lang.Long
import scala.reflect.ClassTag

/**
  * Created by jufeng on 2018/4/23.
  */

@Service
abstract class BaseService [T] {
  /** spring data jpa dao*/
  @Autowired val jpaRepository: JpaRepository[T, Long] = null

  /**
    * @param s <: T
    * @return T
    */
  def save[S <: T](s: S) : T = jpaRepository.save(s)

  /**
    * @param id 数据Id
    * @return Unit
    */

  def delete(id: Long): Unit = jpaRepository.delete(id)



  /**
    * @param s <: T
    * @return T
    */
  @Transactional
  def update[S <: T](s: S) : T = jpaRepository.save(s)

  /**
    * @param id 数据Id
    * @return T
    */
  def find (id: Long):T  = jpaRepository.findOne(id)

  /**
    * @return List[T]
    */
  def findAll= jpaRepository.findAll()


  /**
    * @return Long
    */
  def count : Long = jpaRepository.count

  /**
    * @param id 数据Id
    * @return Boolean
    */
  def exist(id: Long) : Boolean = jpaRepository.exists(id)

  /**
    * @param page 起始页
    * @param pageSize 每页大小
    * @return Page[T]
    */
  def page[S <: T](page: Int, pageSize: Int): Page[T] = {
    var rpage = if (page < 1) 1 else page;
    var rpageSize = if (pageSize < 1) 5 else pageSize;
    jpaRepository.findAll(new PageRequest(rpage - 1, pageSize))
  }


}

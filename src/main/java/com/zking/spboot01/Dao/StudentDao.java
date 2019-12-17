package com.zking.spboot01.Dao;

import com.zking.spboot01.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @author hui
 * @create 2019-12-17 18:46:22
 */
@Repository
public interface  StudentDao extends JpaRepository<Student,Integer> {
    @Query(value="select * from studentinfo where stu_name like %?%",nativeQuery = true)
    Student findByStuname(String stuname);
}

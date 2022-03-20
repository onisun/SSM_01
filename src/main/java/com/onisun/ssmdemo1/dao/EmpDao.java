package com.onisun.ssmdemo1.dao;


import com.onisun.ssmdemo1.bean.Emp;

/**
 * @author Neo
 * @version 1.0
 */
public interface EmpDao {

    Emp getEmpByEmpno(Integer empno);

}

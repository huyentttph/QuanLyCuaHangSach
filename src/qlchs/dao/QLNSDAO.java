/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlchs.dao;

import java.util.List;

/**
 *
 * @author tachi
 */
public abstract class QLNSDAO<EntityTyle, KeyTyle> {
    public abstract void insert(EntityTyle entity);
    public abstract void update(EntityTyle entity);
    public abstract void delete(KeyTyle id);
    public abstract List<EntityTyle> selectAll();
    public abstract EntityTyle selectById(KeyTyle id);
    public abstract List<EntityTyle> selectBySql(String sql,Object... args);
}

package com.shop.cafe.dao;

import java.sql.*;
import java.util.*;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.shop.cafe.dto.Product;

@Mapper
public interface ProductDao {	
	
	public  List<Product> getAllProducts() throws Exception;
	
	
}

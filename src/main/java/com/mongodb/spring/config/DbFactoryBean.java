package com.mongodb.spring.config;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.util.Assert;

import com.mongodb.DB;
import com.mongodb.Mongo;

public final class DbFactoryBean implements FactoryBean<DB> {
  private Mongo mongo;
  private String name;
  
  @Override
  public DB getObject() throws Exception {
    Assert.notNull(mongo);
    Assert.notNull(name);
    return mongo.getDB(name);
  }

  @Override
  public Class<?> getObjectType() {
    return DB.class;
  }

  @Override
  public boolean isSingleton() {
    return true;
  }
  
  @Required
  public void setMongo(Mongo mongo) {
    this.mongo = mongo;
  }

  @Required   
  public void setName(String name) {
    this.name = name;
  }
}

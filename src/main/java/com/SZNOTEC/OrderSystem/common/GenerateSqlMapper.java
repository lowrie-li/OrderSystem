package com.SZNOTEC.OrderSystem.common;


import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GenerateSqlMapper {
    public void generator() throws Exception{
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        File configFile = new File("/Users/yuantli/IdeaProjects/OrderSystem/src/main/java/com/SZNOTEC/OrderSystem/common/generatorConfig.xml");

        if (configFile.exists()) {
            System.out.println("File does exist!");
        } else {
            System.out.println("File does not exist!");
        }
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        if (config != null) {
            System.out.println("Read configuration OK!");
        } else {
            System.out.println("Read configuration failed!");
        }
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
                callback, warnings);
        myBatisGenerator.generate(null);
    }

//    public static void main(String[] args) throws Exception {
//        try {
//            GenerateSqlMapper generatorSqlMap = new GenerateSqlMapper();
//            generatorSqlMap.generator();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}

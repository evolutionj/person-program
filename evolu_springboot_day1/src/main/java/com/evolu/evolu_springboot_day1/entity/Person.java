package com.evolu.evolu_springboot_day1.entity;

public class Person {

    /**
     * name : pig
     * age : 18
     * sex : man
     * hometown : {"province":"江西省","city":"抚州市","county":"崇仁县"}
     */

    private String name;
    private String age;
    private String sex;
    private HometownBean hometown;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public HometownBean getHometown() {
        return hometown;
    }

    public void setHometown(HometownBean hometown) {
        this.hometown = hometown;
    }

    public static class HometownBean {
        /**
         * province : 江西省
         * city : 抚州市
         * county : 崇仁县
         */

        private String province;
        private String city;
        private String county;

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCounty() {
            return county;
        }

        public void setCounty(String county) {
            this.county = county;
        }
    }
}

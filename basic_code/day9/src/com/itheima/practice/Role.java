package com.itheima.practice;

import java.util.Random;

public class Role {
    private String name;
    private int health;
    private char gender;
    private String appearance;

    String[] boyApperance = {"风流俊雅","气宇轩昂","相貌英俊","五官端正","相貌平平","一塌糊涂","面目狰狞"};
    String[] girlApperance = {"美丽绝伦","沉鱼落雁","亭亭玉立","身材姣好","相貌平平","相貌简陋","惨不忍睹"};

    String[] attack_desc = {
            "%s使出一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出一招【游空浮爪】，飞起身形自半空中变掌为抓锁向%s。"
    };

    String[] injured_desc = {
            "结果%s退了半步，毫发无损。",
            "结果%s一声惨叫，像软泥一般倒了下去。"
    };


    public Role() {
    }

    public Role(String name, int health, char gender) {
        this.name = name;
        this.health = health;
        this.gender = gender;
        setAppearance(gender);
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(char gender) {
        Random r = new Random();
        if (gender == '男'){
            int index = r.nextInt(boyApperance.length);
            this.appearance = boyApperance[index];
        } else if (gender == '女') {
            int index = r.nextInt(girlApperance.length);
            this.appearance = girlApperance[index];
        }
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return health
     */
    public int getHealth() {
        return health;
    }

    /**
     * 设置
     * @param health
     */
    public void setHealth(int health) {
        this.health = health;
    }

    public void attack(Role role){
        Random r = new Random();
        int index = r.nextInt(attack_desc.length);
        String Kungfu = attack_desc[index];
        System.out.printf(Kungfu,this.getName(),role.getName());
        System.out.println();

        //计算造成的伤害
        int damage = r.nextInt(20) + 1;

        //修改被打人的血量
        int remainHealth = role.getHealth() - damage;
        remainHealth = remainHealth < 0 ? 0: remainHealth;
        role.setHealth(remainHealth);

        if (remainHealth > 90) {
            System.out.printf(injured_desc[0],role.getName());
            System.out.println();
        } else {
            System.out.printf(injured_desc[1],role.getName());
            System.out.println();
        }
    }

    public void showPlayerInfo(){
        System.out.println("姓名： "+ getName());
        System.out.println("血量： "+ getHealth());
        System.out.println("性别： "+ getGender());
        System.out.println("长相： "+ getAppearance());
    }
}

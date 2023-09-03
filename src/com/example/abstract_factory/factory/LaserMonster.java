package com.example.abstract_factory.factory;

import com.example.abstract_factory.Skill;

// 汎用的な具象クラス. 他クラスが継承する
public class LaserMonster implements Monster {
    // multiplierの作成
    protected static int[] MULTIPLIERS = {100, 20, 30, 5, 1};

    protected String monsterName;
    protected int hp;
    protected int attack;
    protected int defense;
    protected int level;
    protected int points;
    protected int movementSpeed;
    protected Skill[] specialSkills;

    public LaserMonster(int hp, int attack, int defense, int level,
                        int points, int movementSpeed) {
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.level = level;
        this.points = points;
        this.movementSpeed = movementSpeed;

        this.setInitialSkills();
    }

    // レベルに基づく汎用的なアルゴリズム.
    public LaserMonster(int level) {
        this.hp = level * LaserMonster.MULTIPLIERS[0];
        this.attack = level * LaserMonster.MULTIPLIERS[1];
        this.defense = level * LaserMonster.MULTIPLIERS[2];
        this.level = level;
        this.points = level * level * LaserMonster.MULTIPLIERS[3];
        this.movementSpeed = level * LaserMonster.MULTIPLIERS[4];

        this.setInitialSkills();
    }

    // 初期スキルの設定. カスタムスキル設定のため継承先のクラスでオーバーライド
   protected void setInitialSkills() {
        Skill[] skills = {
                new Skill(this.attack, "Generic attack")};
        this.setSpecialSkills(skills);
   }

   protected void setSpecialSkills(Skill[] skills) {
        this.specialSkills = skills;
   }

    @Override
    public int getHp() {
        return this.hp;
    }

    @Override
    public int getAttack() {
        return this.attack;
    }

    @Override
    public int getDefence() {
        return this.defense;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int getPoints() {
        return this.points;
    }

    @Override
    public int getMovementSpeed() {
        return this.movementSpeed;
    }

    @Override
    public String getMonsterName() {
        return "Generic Monster";
    }

    @Override
    public String getAppearance() {
        return "Grey block monster with a ? as its texture.";
    }

    @Override
    public String kill() {
        this.hp = 0;
        return this.toString()
                + " died. The body drops and disappears from the screen in 2 seconds.";
    }

    @Override
    public Skill[] getSpecialSkill() {
        return this.specialSkills;
    }

    @Override
    public String toString() {
        return this.getMonsterName()
                + " hp-" + this.hp
                + "/atk-" + this.attack
                + "/def-" + this.defense
                + "/lvl-" + this.level;
    }
}

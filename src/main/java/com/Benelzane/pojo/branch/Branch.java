package com.Benelzane.pojo.branch;

import java.util.Objects;

public class Branch {
    private int id;
    private String name;

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    protected Branch(){}

    public static class BranchBuilder{
        private int id;
        private String name;

        public BranchBuilder buildId(int id){
            this.id = id;
            return this;
        }//end of buildId method

        public BranchBuilder buildName(String name){
            this.name = name;
            return this;
        }
    }//end of branch builder class

    @Override
    public String toString(){
        return "Branch{" +
                "branch Id='" + id + '\'' +
                ", Branch name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Branch that = (Branch) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name);
    }
}//end of branch class

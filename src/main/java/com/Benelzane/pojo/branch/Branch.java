package com.Benelzane.pojo.branch;

import java.util.Objects;

public class Branch {
    private String branchId;
    private String name;

    public String getId(){
        return this.branchId;
    }

    public String getName(){
        return this.name;
    }

    protected Branch(){}

    public static class BranchBuilder{
        private String branchId;
        private String name;

        public BranchBuilder buildId(String branchId){
            this.branchId = branchId;
            return this;
        }//end of buildId method

        public BranchBuilder buildName(String name){
            this.name = name;
            return this;
        }

        public Branch buildBranch(){
            Branch branch = new Branch();
            branch.branchId = this.branchId;
            branch.name = this.name;
            return branch;
        }
    }//end of branch builder class

    @Override
    public String toString(){
        return "Branch{" +
                "branch Id='" + branchId + '\'' +
                ", Branch name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Branch that = (Branch) o;
        return Objects.equals(branchId, that.branchId) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branchId, name);
    }


}//end of branch class

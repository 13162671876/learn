package com.hjx.design.abstractFactoryDesign;

/**
 * @Desc   抽象工厂
 *         要创建一系列的产品对象，而且这一系列对象是构建新的对象所需要的组成部分，也就是这一系列被创建的对象相互之间是有约束的。
 *         cpu和主板有适配关系，对象之间存在约束关系
 * @Author huangjianxiong
 * @Date 2019/11/28
 **/
public class ComputerEngineer {
    /**
     * 定义组装机器需要的CPU
     */
    private CpuApi cpu= null;
    /**
     * 定义组装机器需要的主板
     */
    private MainboardApi mainboard = null;

    public void makeComputer(AbstractFactory schemal){
        this.cpu = schemal.selectCpu();

        this.mainboard = schemal.selectCpuMainBoard();
    }


    public static void main(String[] args) {
        //创建装机工程师对象
        ComputerEngineer engineer = new ComputerEngineer();
        //客户选择并创建需要使用的装机方案对象
        AbstractFactory schema = new Schemal1();
        //告诉装机工程师自己选择的装机方案，让装机工程师组装电脑
        engineer.makeComputer(schema);
    }


}

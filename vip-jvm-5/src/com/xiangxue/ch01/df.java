package com.xiangxue.ch01;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class df extends dh {
    @Override
    public  List aVoid() {
        this.sd();
      return   Collections.EMPTY_LIST;
    }
    public static  final int SUN=2;
    public static final  int YHJ=4;
    public enum Dept{SUN,YHJ}

    public static Optional<OOM> s(){
        if(1==1){
            return Optional.of(new OOM());
        }
        return Optional.empty();
    }

    public static Optional<User> user(User user){
        return Optional.ofNullable(user);
    }

    public double sdd(){
        aVoid();
        s();
        return 2;
    }
    public static void main(String[] args) {
        System.out.println(new df().aVoid().size()==1);
        System.out.println(s().get());
        System.out.println("**********");
        Optional<User> userOptional=user(new User("对方",2));

        System.out.println(userOptional);
        System.out.println("***1*"+userOptional.get().getName());
        User user=new User();
        Optional<User> userOptiona2=user(user);
        System.out.println(user(user));
        System.out.println("*2***"+userOptiona2.isPresent());
        user=null;
        Optional<User> userOptiona3=user(user);
        System.out.println(user(user));
        System.out.println("***3*"+userOptiona3.isPresent());

      // new DirectMem();
       System.out.println(Dept.YHJ.ordinal()+"*******"+DirectMem.num);
       // System.out.println(DirectMem.sd.num);
    }
}

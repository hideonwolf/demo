package com.example.demo.manager;

public class ResourseManager {




        public static ResourseManager getInstance;
        private int count = 0;
        private static ResourseManager instance = new ResourseManager();
        private ResourseManager(){}
        public static ResourseManager getInstance() {
            return instance;
        }
        public synchronized void addCount(int i){
            count = count+i;
        }
        public synchronized void minusCount(int i){
            count= count-i;
        }
        public int getCount(){
            return count;
        }
    }



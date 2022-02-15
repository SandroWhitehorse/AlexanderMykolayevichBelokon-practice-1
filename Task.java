/*
 * Class Task
 *
 * V1.1
 * This class using to create not repitative and repitative task
 *
 * author: Alexander Mykolayevich Belokon
 */
package com.nc.edu.ta.AlexanderMykolayevichBelokon.pr1.task;

public class Task {
        private String title ; // private variable for title of task
        private boolean active; // private variable for
        private int time = 0; //
        private int start = 0; //
        private int end = 0; //
        private int repeat; //

        // This constructor Task(String title, int time) uses when is needed a create and use not
        // repeatable  in code and have two parameters^ String title
        // is  name of task, and int time - is time of task;
        // and this class need most of the functions from class Task which are useful in this constructor
        public Task(String title, int time) {
                this.title=title; // local variable for title of task
                // local variable for time
                this.time=time; //
                this.active= false;//
                this.repeat=0;//
        }

        //This constructor Task(String title, int start, int end, int repeat) uses when is needed
        // a new task creating and use with parameters String title - it is name of task,int start is a
        // variable which meaning is  start time, int end meaning is end time for
        // repeatable Task in code and int repeat is parameter which show time for repeating task
        public Task(String title, int start, int end, int repeat) {
                this.title = title; // private variable for title of task
                // private variable for
                this.start = start;
                this.end= end;
                this.repeat=repeat;
                this.active= false;
        }

        // getTitle() is for returning title string
        public String getTitle() {
                return title;
        }

        // setTitle(String title) is for setting string from parameter
        // title in private variable title in class Task
        public void setTitle(String title) {
                this.title = title;

        }

        // IsActive() return boolean that means: is this an active task
        public boolean isActive() {

                return this.active;
        }

        // setActive(boolean active) set in private variable in class
        // Task parameter active which means : is this task active
        public void setActive(boolean active) {

                this.active = active;
        }

        // setTime(int time) set time for not repeatable  task
        // and change isRepeated variable for
        public void setTime(int time) {
                this.time = time;


                        this.repeat = 0;


        }

        // This method sets times of start end and repeating time interval
        // for repeatable Task
        public void setTime(int start, int end, int repeat) {
                this.start = start;
                this.end = end;
                this.repeat = repeat;

        }

        //method getTime must return time Task
        public int getTime() {
                if (this.isRepeated()) {
                        return this.start;
        }
                else {
                        return this.time;
                }
        }

        //method int GetStream must return int for task start time
        public int getStartTime() {
                if (this.isRepeated()) {
                return this.start;
        } else {
            return this.time;
        }
        }

        //this method may return end time of task
        public int getEndTime() {
        if (this.isRepeated()) {
                return this.end;
        } else {
                return this.time;
        }
        }

        //this method need return interval time of repeatable task
        public int getRepeatInterval() {
                if (this.isRepeated()) { return this.repeat;}
                     else {   return 0; }

        }

        //isRepeated() return boolean that mean: is repeating in task?
        public boolean isRepeated() {
                return this.repeat != 0;
        }

        //toString() return string with information in three cases:
        //Task “<title>” is inactive - when is no active task
        //Task “<title>” at <time>  -when is one active task in some time
        //Task “<title>” from <start> to <end> every <repeat> hours - when is repeatable in every some time
        public String toString() {
                String returningStr = null;
                if (!this.active) {

                        returningStr = ("Task "+this.title+" is inactive");

                }
                if (this.repeat==0) {

                        returningStr = "Task "+this.title+" at "+this.time;

                }

                if (this.repeat!=0) {

                        returningStr = "Task "+this.title+" from "+this.start+" to "+this.end+" every "+this.repeat+" hours";

                }
        return returningStr;
        }

        //nextTimeAfter(int time) return if it exists next task time after
        // time or return -1 if not active.
        public int nextTimeAfter(int time) {
                if (active){
                        for (int i = this.start; i<=this.end; i=i+this.repeat){
                                boolean b = (i + repeat) <= end;
                                if (i>time) {
                                        if (b){
                                                return  i;
                                        };

                        }
                        };
                        }
                return -1;
        }
}






public enum NameState {
    // wrong
    SWrong{
        @Override
        public NameState nextState(char a){
            return this;
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    // default
    S0{
        @Override
        public NameState nextState(char a){
            if(a=='a'){
                return S1;
            }else if(a=='b'){
                return S5;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    // auto
    S1{
        @Override
        public NameState nextState(char a){
            if(a=='u'){
                return S2;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S2{
        @Override
        public NameState nextState(char a){
            if(a=='t'){
                return S3;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S3{
        @Override
        public NameState nextState(char a){
            if(a=='o'){
                return S4;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S4{
        @Override
        public NameState nextState(char a){
            return SWrong;
        }
        @Override
        public boolean isOver(){
            return true;
        }
    },
    // break
    S5{
        @Override
        public NameState nextState(char a){
            if(a=='r'){
                return S6;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S6{
        @Override
        public NameState nextState(char a){
            if(a=='e'){
                return S7;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S7{
        @Override
        public NameState nextState(char a){
            if(a=='a'){
                return S8;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S8{
        @Override
        public NameState nextState(char a){
            if(a=='k'){
                return S9;
            }else{
                return SWrong;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S9{
        @Override
        public NameState nextState(char a){
            return SWrong;
        }
        @Override
        public boolean isOver(){
            return true;
        }
    };

    public abstract NameState nextState(char a);
    public abstract boolean isOver();
}

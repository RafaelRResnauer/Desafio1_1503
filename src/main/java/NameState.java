public enum NameState {
    S0{
        @Override
        public NameState nextState(char a){
            if(a=='a'){
                return S1;
            }else{
                return S0;
            }
        }
        @Override
        public boolean isOver(){
            return false;
        }
    },
    S1{
        @Override
        public NameState nextState(char a){
            if(a=='u'){
                return S2;
            }else{
                return S1;
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
                return S2;
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
                return S3;
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
            return this;
        }
        @Override
        public boolean isOver(){
            return true;
        }
    };
    public abstract NameState nextState(char a);
    public abstract boolean isOver();
}

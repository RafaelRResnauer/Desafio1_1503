public enum NamingRulesSM {
    Wrong{
        @Override
        public NamingRulesSM nextState(char a) {
            return this;
        }

        @Override
        public boolean isOver() { return true; }
    },
    Start {
        @Override
        public NamingRulesSM nextState(char a) {
            if(Character.isLetter(a) || a == 95){
                return Right;
            }else{
                return Wrong;
            }
        }

        @Override
        public boolean isOver() {
            return false;
        }
    },
    Right {
        @Override
        public NamingRulesSM nextState(char a) {
            if(Character.isLetter(a) || Character.isDigit(a) || a == 95){
                return Right;
            }else{
                return Wrong;
            }
        }

        @Override
        public boolean isOver() {
            return false;
        }
    };
    public abstract NamingRulesSM nextState(char a);
    public abstract boolean isOver();
}

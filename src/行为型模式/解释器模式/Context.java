package 行为型模式.解释器模式;

import java.util.ArrayList;
import java.util.List;

class Context {
    private String content;

    private List list = new ArrayList();

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Expression> getList() {
        return list;
    }

    public void add(Expression eps){
        list.add(eps);
    }
}

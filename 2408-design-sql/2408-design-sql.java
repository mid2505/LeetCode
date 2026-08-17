class SQL {
    HashMap<String,Bundle> meta = new HashMap<>();
    HashMap<String,HashMap<Integer,List<String>>> db = new HashMap<>();
    public SQL(List<String> names, List<Integer> columns) {
        for(int i=0;i<names.size();i++){
            Bundle b = new Bundle(columns.get(i));
            meta.put(names.get(i),b);
            HashMap<Integer,List<String>> table = new HashMap<>();
            db.put(names.get(i),table);
        }
    }
    
    public boolean ins(String name, List<String> row) {
        if(db.containsKey(name) && row.size()==meta.get(name).cap){
            HashMap<Integer,List<String>> temp = db.get(name);
            temp.put(meta.get(name).id,row);
            db.put(name,temp);
            meta.get(name).id = meta.get(name).id+1;
            return true;
        }
        else return false;   
    }
    
    public void rmv(String name, int rowId) {
        if(db.containsKey(name)){
            if(db.get(name).containsKey(rowId)){
                db.get(name).remove(rowId);
            }
        }
    }
    
    public String sel(String name, int rowId, int columnId) {
        if(db.containsKey(name)){
            if(db.get(name).containsKey(rowId) && meta.get(name).cap>=columnId){
                return db.get(name).get(rowId).get(columnId-1);
            }
        }
        return "<null>";
    }
    
    public List<String> exp(String name) {
        List<String> res = new ArrayList<>();
        if(db.containsKey(name)){
            HashMap<Integer,List<String>> temp = db.get(name);
            for(Map.Entry<Integer,List<String>> m : temp.entrySet()){
                StringBuilder sb = new StringBuilder();
                sb.append(m.getKey()+",");
                List<String> s = m.getValue();
                for(int i=0;i<s.size()-1;i++){
                    sb.append(s.get(i)+",");
                }
                sb.append(s.get(s.size()-1));
                res.add(sb.toString());
            }
        }
        return res;
    }
}
class Bundle{
    int id = 1;
    int cap;
    Bundle(int c){
        cap = c;
    }
}
/**
 * Your SQL object will be instantiated and called as such:
 * SQL obj = new SQL(names, columns);
 * boolean param_1 = obj.ins(name,row);
 * obj.rmv(name,rowId);
 * String param_3 = obj.sel(name,rowId,columnId);
 * List<String> param_4 = obj.exp(name);
 */
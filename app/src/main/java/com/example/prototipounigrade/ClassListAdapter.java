package com.example.prototipounigrade;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class ClassListAdapter extends BaseAdapter {

    private HashMap classItem;
    private ArrayList<HashMap> classes = new ArrayList<>();

    private static LayoutInflater inflater = null;
    //private View v;
    private Activity act;
    private ViewHolder viewHolder = new ViewHolder();

    public ClassListAdapter(Context context) {
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        classItem = new HashMap<>();
        classItem.put("code", "A");
        classItem.put("teacher", "Mauricio");
        classItem.put("time", "12:00");
        classItem.put("campus", "Darcy");
        classes.add(classItem);

        classItem = new HashMap<>();
        classItem.put("code", "B");
        classItem.put("teacher", "Milene");
        classItem.put("time", "10:00");
        classItem.put("campus", "FGA");
        classes.add(classItem);

        classItem = new HashMap<>();
        classItem.put("code", "C");
        classItem.put("teacher", "Vandor");
        classItem.put("time", "08:00");
        classItem.put("campus", "Ceilândia");
        classes.add(classItem);


        /*classCode = new ArrayList<>();
        classCode.add("12345");
        classCode.add("65432");
        classCode.add("32132");

        classTeacher = new ArrayList<>();
        classTeacher.add("Mario");
        classTeacher.add("Joao");
        classTeacher.add("Maria");

        classTime = new ArrayList<>();
        classTime.add("12:00");
        classTime.add("14:00");
        classTime.add("20:00");

        classCampus = new ArrayList<>();
        classCampus.add("Darcy");
        classCampus.add("Ceilândia");
        classCampus.add("Gama"); */
    }

    @Override
    public int getCount() {
        //return turmas.size();
        return classes.size();
    }

    @Override
    public Object getItem(int position) {
        return classes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = inflater.inflate(R.layout.class_list_item, null);

        classItem = classes.get(position);

        viewHolder.classCampus = view.findViewById(R.id.classCampusItem);
        viewHolder.classCode = view.findViewById(R.id.classCodeItem);
        viewHolder.classTeacher = view.findViewById(R.id.classTeacherItem);
        viewHolder.classTime = view.findViewById(R.id.classTimeItem);

        viewHolder.classCode.setText((String)classItem.get("code"));
        viewHolder.classTeacher.setText((String)classItem.get("teacher"));
        viewHolder.classCampus.setText((String)classItem.get("campus"));
        viewHolder.classTime.setText((String)classItem.get("time"));

        /*
        HashMap item = (HashMap) getItem(position);
        v = convertView;

        if (convertView == null){
            v = inflater.inflate(R.layout.class_list_item, null);
            viewHolder = new ViewHolder();

            viewHolder.checkbox = v.findViewById(R.id.checkbox);
            viewHolder.classCode = v.findViewById(R.id.classCodeItem);
            viewHolder.classTeacher = v.findViewById(R.id.classTeacherItem);
            viewHolder.classTime = v.findViewById(R.id.classTimeItem);

            viewHolder.classCampus = v.findViewById(R.id.classCampusItem);
            v.setTag(viewHolder);
        }

        viewHolder = (ViewHolder) v.getTag();

        viewHolder.classCode.setText((String)item.get("code"));
        viewHolder.classTeacher.setText((String)item.get("teacher"));
        viewHolder.classCampus.setText((String)item.get("campus"));
        viewHolder.classTime.setText((String)item.get("time"));
        viewHolder.checkbox.setText((String)item.get("checkbox"));

        return null;
        */
        return view;
    }

    private class ViewHolder{
        TextView classCode;
        TextView classTeacher;
        TextView classTime;
        TextView classCampus;
        CheckBox checkbox;
    }
}

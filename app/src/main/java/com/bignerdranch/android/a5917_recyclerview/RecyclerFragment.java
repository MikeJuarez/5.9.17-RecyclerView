package com.bignerdranch.android.a5917_recyclerview;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import static com.bignerdranch.android.a5917_recyclerview.BabyFactory.get;

/**
 * Created by user on 5/9/2017.
 */

public class RecyclerFragment extends Fragment {

    private RecyclerView mBabyRecyclerView;
    private BabyAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.onCreateView(inflater, container, savedInstanceState);

        View view = inflater.inflate(R.layout.fragment_baby_list, container, false);

        mBabyRecyclerView = (RecyclerView) view.findViewById(R.id.baby_recycler_view);
        mBabyRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();

        return view;
    }

    private void updateUI() {
        BabyFactory babyFactory = BabyFactory.get(getActivity());
        List<Baby> babies = babyFactory.getsBabyList();
        Toast.makeText(getActivity(), "BabyListSize: " + babies.size(), Toast.LENGTH_SHORT).show();
        mAdapter = new BabyAdapter(babies);
        mBabyRecyclerView.setAdapter(mAdapter);
    }

    private class BabyViewHolder extends RecyclerView.ViewHolder {

        private Baby mBaby;
        private TextView mNameTextView;
        private TextView mAgeTextView;

        public BabyViewHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.list_item_baby, parent, false));

            mNameTextView = (TextView) itemView.findViewById(R.id.baby_name);
            mAgeTextView = (TextView) itemView.findViewById(R.id.baby_age);
        }

        public void bind(Baby baby)
        {
            mBaby = baby;
            mNameTextView.setText(mBaby.getBabyName());
            mAgeTextView.setText(mBaby.getAge());
        }
    }

    private class BabyAdapter extends RecyclerView.Adapter<BabyViewHolder> {
        private List<Baby> mBabyList;

        public BabyAdapter(List<Baby> babies) {
            mBabyList = babies;
        }

        @Override
        public BabyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutinflater = LayoutInflater.from(getActivity());

            return new BabyViewHolder(layoutinflater, parent);
        }

        @Override
        public void onBindViewHolder(BabyViewHolder holder, int position) {
            Baby baby = mBabyList.get(position);
            holder.bind(baby);
        }

        @Override
        public int getItemCount() {
            return mBabyList.size();
        }
    }

}

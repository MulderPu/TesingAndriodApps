package app.com.example.mulder.sunshine.app;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private ArrayAdapter<String> mForecastAdapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String[] forecastArray = {
                "Today - Sunday - 88/63",
                "Today-Sunday-88/63",
                "Today-Sunday-88/63",
                "Today-Sunday-88/63",
                "Today-Sunday-88/63",
                "Today-Sunday-88/63",
                "Today-Sunday-88/63",
                "Today-Sunday-88/63",
                "Today-Sunday-88/63",
                "Today-Sunday-88/63",
                "Today-Sunday-88/63",
                "Today-Sunday-88/63",
                "Today-Sunday-88/63",
                "Today-Sunday-88/63",
                "Today-Sunday-88/63",
                "Today-Sunday-88/63"
        };

        List<String> weekForecast = new ArrayList<String>(
                Arrays.asList(forecastArray)
        );

        mForecastAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                weekForecast
        );

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ListView listView = (ListView) rootView.findViewById(
                R.id.list_item_forecast_textview
        );

        listView.setAdapter(mForecastAdapter);

        return rootView;
    }
}

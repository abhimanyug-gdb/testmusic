package com.gdb.testmusic;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by gdb on 21/12/15.
 */
public class SongListAdapter extends CursorAdapter {

    public static class ViewHolder{
        public final ImageView songIconImage;
        public final TextView songNameText;
        public final TextView songGenreText;
        public final TextView songAlbumText;
        public final ImageView songHeartCountImage;
        public final TextView songHeartCountText;
        public final ImageView songPlayCountImage;
        public final TextView songPlayCountText;
        public final ImageView songPlaytimeImage;
        public final TextView songPlaytimeText;
        public final ImageButton songOptionButton;

        public ViewHolder (View view) {
            songIconImage = (ImageView) view.findViewById(R.id.list_item_icon);
            songNameText = (TextView) view.findViewById(R.id.list_item_song_name_textview);
            songGenreText = (TextView) view.findViewById(R.id.list_item_song_genre_textview);
            songAlbumText = (TextView) view.findViewById(R.id.list_item_song_album_textview);
            songHeartCountImage = (ImageView) view.findViewById(
                    R.id.list_item_song_heart_count_imageview);
            songHeartCountText = (TextView) view.findViewById(
                    R.id.list_item_song_heart_count_textview);
            songPlayCountImage = (ImageView) view.findViewById(
                    R.id.list_item_song_play_count_imageview);
            songPlayCountText = (TextView) view.findViewById(
                    R.id.list_item_song_play_count_textview);
            songPlaytimeImage = (ImageView) view.findViewById(
                    R.id.list_item_song_playtime_imageview);
            songPlaytimeText = (TextView) view.findViewById(R.id.list_item_song_playtime_textview);
            songOptionButton = (ImageButton) view.findViewById(R.id.list_item_song_option_button);
        }
    }

    public SongListAdapter(Context context, Cursor c, int flags) {
        super(context, c, flags);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_songlist, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);
        view.setTag(viewHolder);
        return view;
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        ViewHolder viewHolder = (ViewHolder) view.getTag();
            /*viewHolder.iconView.setImageResource(Utility.getArtResourceForWeatherCondition(
                cursor.getInt(ForecastFragment.COL_WEATHER_CONDITION_ID)));*/
        viewHolder.songIconImage.setImageResource(R.drawable.album_art);
        viewHolder.songNameText.setText(R.string.song_name);
        viewHolder.songGenreText.setText(R.string.song_genre);
        viewHolder.songAlbumText.setText(R.string.song_album);
        viewHolder.songHeartCountText.setText(R.string.song_heart_count);
        viewHolder.songHeartCountImage.setImageResource(R.drawable.ic_vector_heart);
        viewHolder.songPlayCountText.setText(R.string.song_play_count);
        viewHolder.songPlayCountImage.setImageResource(R.drawable.ic_vector_play);
        viewHolder.songPlaytimeText.setText(R.string.song_play_time);
        viewHolder.songPlaytimeImage.setImageResource(R.drawable.ic_vector_playtime);
        viewHolder.songOptionButton.setImageResource(R.drawable.ic_vector_options);
    }
}

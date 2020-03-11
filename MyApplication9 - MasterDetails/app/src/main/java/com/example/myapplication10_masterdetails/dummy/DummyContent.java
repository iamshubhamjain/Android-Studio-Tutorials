package com.example.myapplication10_masterdetails.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

//    private static final int COUNT = 25;
    private static final int COUNT = 2;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        final String GOOGLE = "https://www.google.com";
        final String YOUTUBE = "https://www.youtube.com";
        String website;
        if(position == 1)
            website = GOOGLE;
        else
            website = YOUTUBE;
//        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
        return new DummyItem(String.valueOf(position), "Item " + position, website);
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        //public final String details;
        public final String webpage;

        public DummyItem(String id, String content, String webpage) {
            this.id = id;
            this.content = content;
            this.webpage = webpage;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}

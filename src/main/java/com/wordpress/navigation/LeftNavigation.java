package com.wordpress.navigation;

public class LeftNavigation {
    public static class Posts {
        public static class AddNews {
            public static void selects() {
                MenuSelector.select("menu-posts", "Add New");
            }
        }
        public static class allPosts {
            public   static void select() {
                MenuSelector.select("menu-posts", "All Posts");
            }
        }
    }

    public static class Pages {
        public static class AllPages {
          public   static void select() {
                MenuSelector.select("menu-pages", "All Pages");
            }
        }
    }
}

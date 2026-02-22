CREATE TABLE files (
    id TEXT PRIMARY KEY NOT NULL,
    user_id TEXT NOT NULL,
    uploaded_at INTEGER NOT NULL,
    file_name TEXT NOT NULL,
    file_location TEXT NOT NULL,
    extension TEXT NOT NULL,
    file_size INTEGER NOT NULL
);

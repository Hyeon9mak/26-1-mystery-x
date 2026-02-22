package com.buchoipark

import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.RowMapper
import org.springframework.stereotype.Repository
import java.sql.ResultSet

@Repository
class FileRepository(
    private val jdbcTemplate: JdbcTemplate
) {
    companion object {
        private val ROW_MAPPER = RowMapper<File> { rs: ResultSet, _: Int ->
            File(
                id = rs.getString("id"),
                userId = rs.getString("user_id"),
                uploadedAt = rs.getLong("uploaded_at"),
                fileName = rs.getString("file_name"),
                fileLocation = rs.getString("file_location"),
                extension = rs.getString("extension"),
                fileSize = rs.getLong("file_size")
            )
        }
    }
}

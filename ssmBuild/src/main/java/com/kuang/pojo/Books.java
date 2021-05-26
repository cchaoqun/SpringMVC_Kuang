package com.kuang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/26-0:16
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Books implements Serializable {
    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;
}

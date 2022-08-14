package com.hanghea99.minispring.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Heart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn
	private Member member;

	@ManyToOne
	@JoinColumn(name = "ARTICLE_ID")
	private Article article;

	@ManyToOne
	@JoinColumn(name = "COMMENT_ID")
	private Comment comment;
}

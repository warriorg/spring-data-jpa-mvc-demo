/** *  */package com.myb.modul.activity.predicate;import javax.persistence.criteria.CriteriaBuilder;import javax.persistence.criteria.CriteriaQuery;import javax.persistence.criteria.Predicate;import javax.persistence.criteria.Root;import org.springframework.data.jpa.domain.Specification;import com.myb.modul.activity.domain.T_info_Activity;/** * @author warrior * */public class ActivitySpecifications {	public static Specification<T_info_Activity> filterActivity(){		return new Specification<T_info_Activity>() {			@Override			public Predicate toPredicate(Root<T_info_Activity> root,					CriteriaQuery<?> query, CriteriaBuilder cb) {								return cb.equal(root.get("ID"), "");			}		};			}}
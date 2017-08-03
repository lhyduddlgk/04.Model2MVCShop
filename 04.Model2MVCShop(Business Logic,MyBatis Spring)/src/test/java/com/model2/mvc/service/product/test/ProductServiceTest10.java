package com.model2.mvc.service.product.test;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.model2.mvc.common.Search;
import com.model2.mvc.service.domain.Product;

import ibatis.services.user.test.SqlSessionFactoryBean;

/*@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/commonservice.xml"})*/
public class ProductServiceTest10 {

	///main method
		public static void main(String[] args) throws Exception{
		
			//==> SqlSessionFactoryBean.getSqlSession()을 이용 SqlSession instance GET
			SqlSession sqlSession = SqlSessionFactoryBean.getSqlSession();
			System.out.println("\n");
			
			//==> Test 용 Product instance 생성  
			Product product = new Product("초코파이", "오리온", "170825", 500, " ");
			
			//1. UserMapper10.addProduct Test  :: product table prodName/prodDetail/manuDate/price/fileName 입력값 확인할것 : OK 
			System.out.println(":: 1. addProduct(INSERT)  ? ");
			System.out.println(":: "+ sqlSession.insert("ProductMapper.addProduct",product));
			System.out.println("\n");
			
			//2. UserMapper10.getProduct Test :: 홈런볼 inert 확인 
			System.out.println(":: 2. getProduct(SELECT)  ? ");
			System.out.println(":: "+sqlSession.selectOne("ProductMapper.getProduct", 10002));
			System.out.println("\n");
			
			//3. UserMapper10.uadateUser Test  :: users table age/grade/redDate 입력값 확인할것 : OK
			
			product.setProdName("초코파이");
			
			System.out.println(":: 3. update(UPDATE)  ? ");
			System.out.println(":: "+ sqlSession.update("ProductMapper.updateProduct", product));
			System.out.println("\n");
			
			//4. UserMapper10.getUserList Test  :: Dynamic Query 확인 id=user04/name=온달 검색
			System.out.println(":: 4. getUser(SELECT)  ? ");
			System.out.println(":: "+sqlSession.selectOne("ProductMapper.getProduct", 10002));
			System.out.println("\n");
			
			//5. UserMapper10.removeUser Test
			System.out.println(":: 5. Use10.removeProduct (DELETE)  ? ");
			System.out.println(":: "+sqlSession.delete("ProductMapper.removeProduct", "초코파이"));
			System.out.println("\n");
			System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////");
			System.out.println("\n");
			
			//==> Test 용 Search instance 생성 
			Search search = new Search();
			
			//1. UserMapper10.getUserList Test 
			System.out.println(":: 1. getUserList01(SELECT)  ? ");
			SqlSessionFactoryBean.printList( sqlSession.selectList("ProductMapper.getUserList", search) );
			
			//2. UserMapper10.getUserList Test 
			search.setSearchCondition("prodName");
			ArrayList<String> arrayList = new ArrayList<String>();
			arrayList.add("상품명");
			search.set
			
			//System.out.println(":: 2. getUserList01(SELECT)  ? ");
			//SqlSessionFactoryBean.printList( sqlSession.selectList("UserMapper10.getUserList",search) );
			
			//3. UserMapper10.getUserList Test 
			/*search.setSearchCondition("prodName");
			search.setProdName( new String[]{ "쿠쿠다스"} );
			
			System.out.println(":: 3. getUserList01(SELECT)  ? ");
			SqlSessionFactoryBean.printList( sqlSession.selectList("UserMapper10.getUserList",search) );

			//END::SqlSession  close
			System.out.println("::END::SqlSession 닫기..");
			sqlSession.close();*/
			
		}//end of main
	}//end of class

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
		
			//==> SqlSessionFactoryBean.getSqlSession()�� �̿� SqlSession instance GET
			SqlSession sqlSession = SqlSessionFactoryBean.getSqlSession();
			System.out.println("\n");
			
			//==> Test �� Product instance ����  
			Product product = new Product("��������", "������", "170825", 500, " ");
			
			//1. UserMapper10.addProduct Test  :: product table prodName/prodDetail/manuDate/price/fileName �Է°� Ȯ���Ұ� : OK 
			System.out.println(":: 1. addProduct(INSERT)  ? ");
			System.out.println(":: "+ sqlSession.insert("ProductMapper.addProduct",product));
			System.out.println("\n");
			
			//2. UserMapper10.getProduct Test :: Ȩ���� inert Ȯ�� 
			System.out.println(":: 2. getProduct(SELECT)  ? ");
			System.out.println(":: "+sqlSession.selectOne("ProductMapper.getProduct", 10002));
			System.out.println("\n");
			
			//3. UserMapper10.uadateUser Test  :: users table age/grade/redDate �Է°� Ȯ���Ұ� : OK
			
			product.setProdName("��������");
			
			System.out.println(":: 3. update(UPDATE)  ? ");
			System.out.println(":: "+ sqlSession.update("ProductMapper.updateProduct", product));
			System.out.println("\n");
			
			//4. UserMapper10.getUserList Test  :: Dynamic Query Ȯ�� id=user04/name=�´� �˻�
			System.out.println(":: 4. getUser(SELECT)  ? ");
			System.out.println(":: "+sqlSession.selectOne("ProductMapper.getProduct", 10002));
			System.out.println("\n");
			
			//5. UserMapper10.removeUser Test
			System.out.println(":: 5. Use10.removeProduct (DELETE)  ? ");
			System.out.println(":: "+sqlSession.delete("ProductMapper.removeProduct", "��������"));
			System.out.println("\n");
			System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////");
			System.out.println("\n");
			
			//==> Test �� Search instance ���� 
			Search search = new Search();
			
			//1. UserMapper10.getUserList Test 
			System.out.println(":: 1. getUserList01(SELECT)  ? ");
			SqlSessionFactoryBean.printList( sqlSession.selectList("ProductMapper.getUserList", search) );
			
			//2. UserMapper10.getUserList Test 
			search.setSearchCondition("prodName");
			ArrayList<String> arrayList = new ArrayList<String>();
			arrayList.add("��ǰ��");
			search.set
			
			//System.out.println(":: 2. getUserList01(SELECT)  ? ");
			//SqlSessionFactoryBean.printList( sqlSession.selectList("UserMapper10.getUserList",search) );
			
			//3. UserMapper10.getUserList Test 
			/*search.setSearchCondition("prodName");
			search.setProdName( new String[]{ "����ٽ�"} );
			
			System.out.println(":: 3. getUserList01(SELECT)  ? ");
			SqlSessionFactoryBean.printList( sqlSession.selectList("UserMapper10.getUserList",search) );

			//END::SqlSession  close
			System.out.println("::END::SqlSession �ݱ�..");
			sqlSession.close();*/
			
		}//end of main
	}//end of class

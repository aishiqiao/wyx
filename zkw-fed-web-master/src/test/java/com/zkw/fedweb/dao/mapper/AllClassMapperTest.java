//package com.zkw.fedweb.dao.mapper;
//
//import com.zkw.fedweb.dao.po.*;
//import com.zkw.fedweb.dao.po.Class;
//import lombok.extern.slf4j.Slf4j;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import javax.annotation.Resource;
//
//import java.util.List;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//@Slf4j
//public class AllClassMapperTest {
//
//    @Resource
//    private AllClassMapper allClassMapper;
//    @Resource
//    private ClumnMapper clumnMapper;
//    @Resource
//    private AttributeMapper attributeMapper;
//    @Resource
//    private ClassMapper classMapper;
//    @Resource
//    private  UserMapper userMapper;
//
//    @Resource
//    private  BannerMapper bannerMapper;
//
//    @Resource
//    private CjwArticalMapper cjwArticalMapper;
//
//    @Resource
//    private XzxArticalMapper xzxArticalMapper;
//
//    @Resource
//    private  ZgzArticalMapper zgzArticalMapper;
//
//    @Resource
//    private  CommentMapper commentMapper;
//
//    @Resource
//    private ClassAttrMapper classAttrMapper;
//
//    //查询首页大标题
//    @Test
//    public void headline() {
//        List<Clumn> headline = clumnMapper.headline();
//        for (Clumn clumn : headline
//                ) {
//            System.out.println(clumn.getName());
//        }
//
//    }
//
//    //查询小初高等一级类名及课程介绍
//    @Test
//    public void XJRecommend() {
//        List<AllClass> XJRecommend = allClassMapper.XJRecommend(2);
//        for (AllClass allClass : XJRecommend
//                ) {
//            System.out.println(allClass.getAcNname());
//            System.out.println(allClass.getIntor());
//
//        }
//
//    }
//
////    //查询资格证二级标题
////    @Test
////    public void ZGRecommend() {
////        List<AllClass> ZGRecommend = allClassMapper.ZGRecommend(1);
////        for (AllClass allClass : ZGRecommend
////                ) {
////            System.out.println(allClass.getName());
////        }
////
////    }
//
//    //查询全部课程名称
//    @Test
//    public void AllCourses() {
//        List<Class> AllCourses = classMapper.AllCourses(43);
//        for (Class classes : AllCourses
//                ) {
//            System.out.println(classes.getName());
//        }
//    }
//
//    //查询课程推荐二级标题名称
//    @Test
//    public void SecondLevel() {
//        List<Attribute> SecondLevel = attributeMapper.SecondLevel(13);
//        for (Attribute attribute : SecondLevel
//                ) {
//            System.out.println(attribute.getName());
//        }
//    }
//
//
//    //查询首页最新课程 插入
//    @Test
//    public void NewClass() {
//        List<Class> NewClasses = classMapper.NewClass(14);
//        for (Class classes : NewClasses
//                ) {
//            System.out.println(classes.getName());
//        }
//    }
//
//    //查询热门课程
//    @Test
//    public void ClassLeader() {
//        List<Class> ClassLeader = classMapper.ClassLeader(12);
//        for (Class classLeader : ClassLeader
//                ) {
//            System.out.println(classLeader.getName());
//        }
//    }
//
//    //查询热卖排行榜
//    @Test
//    public void HotSales() {
//        List<Class> HotSales = classMapper.HotSales(12);
//        for (Class hotSales : HotSales
//                ) {
//            System.out.println(hotSales.getName());
//        }
//    }
//
//
//    //查询个人学习排行榜
//    @Test
//    public void personTop() {
//        List<User> PersonTop = userMapper.PersonTop(3,24);
//        for (User personTop : PersonTop
//                ) {
//            System.out.println(personTop.getNick());
//        }
////        System.out.println(PersonTop.size());
//    }
//
//
//    //查询轮播图
//    @Test
//    public void Carousel() {
//        List<Banner> Carousel = bannerMapper.Carousel(2);
//        for (Banner Carousels : Carousel
//                ) {
//            System.out.println(Carousels.getImg());
//        }
//    }
//
//    //查询成教网新闻列表
//    @Test
//    public void AdultNews() {
//        List<CjwArtical> AdultNews = cjwArticalMapper.AdultNews();
//        for (CjwArtical AdultNewses : AdultNews
//                ) {
//            System.out.println(AdultNewses.getTitle());
//        }
//    }
//
//    //查询小初高新闻列表
//    @Test
//    public void XzxtNews() {
//        List<XzxArtical> XzxtNews = xzxArticalMapper.XzxNews();
//        for (XzxArtical XzxtNewses : XzxtNews
//                ) {
//            System.out.println(XzxtNewses.getTitle());
//        }
//    }
//
//    //查询资格证新闻列表
//    @Test
//    public void ZgztNews() {
//        List<ZgzArtical> ZgztNews = zgzArticalMapper.ZgzNews();
//        for (ZgzArtical ZgztNewses : ZgztNews
//                ) {
//            System.out.println(ZgztNewses.getTitle());
//        }
//    }
//
//
//
//    //根据wid查询评论
//    @Test
//    public void Comments() {
//        List<CommentExt> Comments = commentMapper.selectCommentExt(2);
//        for (Comment Commentses : Comments
//                ) {
//            System.out.println(Commentses.getContent());
//        }
////        System.out.println(Comments.size());
//    }
//
//
//
//    //查询底部内链
//    @Test
//    public void InnerChain() {
//        List<Clumn> InnerChain = clumnMapper.innerChain();
//        for (Clumn InnerChains : InnerChain
//                ) {
//            System.out.println(InnerChains.getName());
//        }
//    }
//
//
//    //
//    @Test
//    public void FindClassList() {
////        List<ClassAttrExt> FindClassList = classExtMapper.findClassList(58,29,48,"xzx",12);
//        List<ClassAttr> FindClassList = classAttrMapper.findClassList(58,29,48,12);
//
////        for (ClassAttrExt FindClassLists : FindClassList
////                ) {
////            System.out.println(FindClassLists.getAcid());
////            System.out.println(FindClassLists.getAllClass());
////        }
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    //添加二级课程名称
//    @Test
//    public void insert() {
//        AllClass allClass = new AllClass();
//        allClass.setId(115);
//        allClass.setImg("imageimage5");
//        allClass.setIntor("intorintor5");
//        allClass.setName("name5");
//        allClass.setSort(115);
//        allClass.setStatus(115);
//        allClass.setWid(115);
//        int insert = allClassMapper.insert(allClass);
//        System.out.println(">>>>>>>>>>>>>> : " + insert);
//    }
//
//
//}
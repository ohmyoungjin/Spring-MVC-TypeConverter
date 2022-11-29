package hello.typeconverter.converter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;
//컨버터 생성을 위해  org.springframework.core.convert.converter.Converter 상속 받는다
//<들어온타입, 변경할 타입> 으로 지정해주면 된다.
@Slf4j
public class StringToIntegerConverter implements Converter<String, Integer> {

    @Override
    public Integer convert(String source) {
        log.info("convert source={}", source);
        //String => Integer change
        return Integer.valueOf(source);
    }
}

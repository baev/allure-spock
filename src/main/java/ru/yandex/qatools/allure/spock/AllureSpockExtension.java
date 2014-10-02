package ru.yandex.qatools.allure.spock;

import org.spockframework.runtime.extension.AbstractGlobalExtension;
import org.spockframework.runtime.model.SpecInfo;

/**
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 24.06.14
 */
public class AllureSpockExtension extends AbstractGlobalExtension {

    private static final SpockRunListener LISTENER = new SpockRunListener();

    @Override
    public void visitSpec(SpecInfo spec) {
        spec.addListener(LISTENER);
    }
}
